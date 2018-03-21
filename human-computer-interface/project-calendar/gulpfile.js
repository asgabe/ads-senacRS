'use strict';

/* GULP PLUGINS
========================================================================== */
var gulp = require('gulp'),
	sass = require('gulp-sass'),
	cleanCSS = require('gulp-clean-css'),
	prefix = require('gulp-autoprefixer'),
	rename = require('gulp-rename'),
	sourcemaps = require('gulp-sourcemaps'),
	clean = require('gulp-clean'),
	requirejsOptimize = require('gulp-requirejs-optimize'),
	runSequence = require('run-sequence');


/* DEV TASKS
========================================================================== */

//Compile the Sass css, prefix the styles and create the sourceMap for the dev CSS
gulp.task('css', function() {

	return gulp.src('dev/sass/major.scss')
	.pipe(sourcemaps.init())
	.pipe(sass({ errLogToConsole:true }))
	.pipe(prefix('last 15 version'))
	.pipe(rename('major.css'))
	.pipe(sourcemaps.write())
	.pipe(gulp.dest('dev/css'));

});

/* PROD TASKS
========================================================================== */

//Minify the dev CSS for production
gulp.task('minifyCSS', function () {

	return gulp.src('dev/sass/major.scss')
	.pipe(sass({ errLogToConsole:true }))
	.pipe(prefix('last 15 version'))
	.pipe(cleanCSS({compatibility: 'ie8'}))
	.pipe(rename('major.css'))
	.pipe(gulp.dest('assets/css'));

});

//Use RequireJS to concatenate the js assets for production
gulp.task('scripts', function () {
	return gulp.src('dev/js/main.js').pipe(gulp.dest('assets/js'));
});

//Clean the assets folder which will receive the rev'ed assets
gulp.task('clean', function () {
    return gulp.src('assets', {read: false})
    .pipe(clean());
});

/* DEV TASKS
========================================================================== */
//Creates a livereload Server and build static assets on the fly.
gulp.task('default', function() {

	//When a SASS file change, build the CSS
	gulp.watch('dev/sass/**/*.scss', ['css'])

});

//Build the complete site inside the "build" folder
gulp.task('build', function() {

 	runSequence('clean', 'minifyCSS', 'scripts');

});





