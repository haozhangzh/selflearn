package org.java.language.specification.demo.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

public class Streams {
	private enum Status {
	        OPEN, CLOSED
	    };

	    private static final class Task {
	        private final Status status;
	        private final Integer points;

	        Task( final Status status, final Integer points ) {
	            this.status = status;
	            this.points = points;
	        }

	        public Integer getPoints() {
	            return points;
	        }

	        public Status getStatus() {
	            return status;
	        }

	        @Override
	        public String toString() {
	            return String.format( "[%s, %d]", status, points );
	        }
	    }
	    
	    public static void main(String[] args){
	    	final Collection< Task > tasks = Arrays.asList(
	    		    new Task( Status.OPEN, 5 ),
	    		    new Task( Status.OPEN, 13 ),
	    		    new Task( Status.CLOSED, 8 ) 
	    		);
	    	final long totalPointsOfOpenTasks = tasks
	    		    .stream()
	    		    .filter( task -> task.getStatus() == Status.OPEN )
	    		    .mapToInt( Task::getPoints )
	    		    .sum();

	    		System.out.println( "Total points: " + totalPointsOfOpenTasks );
	    	Optional<Task> max =tasks.stream().filter(task -> task.getStatus()==Status.OPEN).max(
	    				(e1,e2) -> {
	    					return e1.getPoints() > e2.getPoints()?1:-1;
	    				});
	    	System.out.println(max.map(s ->s.points).orElse(-1));
	    }
}