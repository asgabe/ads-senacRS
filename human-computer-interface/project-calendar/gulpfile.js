'use strict';
 
var gulp = require('gulp');
var sass = require('gulp-sass');
var livereload = require('gulp-livereload');
 
gulp.task('css', function() {
	return gulp.src('src/sass/major.scss')
	.pipe(sass({ errLogToConsole:true }))
	.pipe(gulp.dest('dist/css'));
});

gulp.task('default', function() {
	//Star the liveReload Server
	livereload({ start: true });

	//When a SASS file change, build the CSS
	gulp.watch('src/sass/**/*.scss', ['css']);	

	gulp.watch(['src/sass/**/*.scss', '**/*.html', 'src/js/**/*.js']).on('change', function(file) {
		livereload.changed(file.path);
	});
});