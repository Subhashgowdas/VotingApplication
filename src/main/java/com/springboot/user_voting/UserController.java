package com.springboot.user_voting;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
	public class UserController {
	private static ConcurrentHashMap<String, Integer> candidates = new ConcurrentHashMap<>();

		@RequestMapping("entercandidate")
		public String EnterCandidate(@RequestParam String name) {
			candidates.put(name,0);
	        return "Candidate " + name + " entered successfully with initial vote count 0";
		}
		
		
		@RequestMapping("castvote")
		public String CastVote(@RequestParam String name) {
			 if (candidates.containsKey(name)) {
		            int currentVotes = candidates.get(name);
		            candidates.put(name, currentVotes + 1);
		            return "Vote cast successfully for candidate " + name + ". Updated vote count: " + (currentVotes + 1);
		        } else {
		            return "Invalid candidate. Vote not cast.";
		        }
		}
		
		@RequestMapping("countvote")
		public String countvote (@RequestParam String name) {
			if (candidates.containsKey(name)) {
	            int currentVotes = candidates.get(name);
	            return "Current vote count for candidate " + name + ": " + currentVotes;
	        } else {
	            return "Invalid candidate.";
	        }
		}
		
		@RequestMapping("listvote")
		public ConcurrentHashMap<String, Integer> ListVote() {
			return candidates;
		}
		
		@RequestMapping("getwinner")
		public String GetWinner() {
		     String winner = candidates.entrySet().stream()
		                .max((entry1, entry2) -> entry1.getValue() - entry2.getValue())
		                .map(entry -> entry.getKey())
		                .orElse("No winner yet");
		        return "Winner: " + winner;
		}
	}