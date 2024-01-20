# Voting Application

## Introduction
Welcome to the Voting Application, a simple Spring Boot project for managing votes.

## Features
- Enter candidates and initialize their vote count.
- Cast votes for valid candidates.
- Retrieve the current vote count for a specific candidate.
- List all candidates and their vote counts.
- Determine the winner based on the highest vote count.

## Endpoints

### 1. Enter Candidate
- **Endpoint:** `/entercandidate`
- **Method:** `GET`
- **Parameters:**
  - `name` (String): Candidate name
- **Description:** Adds a candidate to the system with an initial vote count of 0.

### 2. Cast Vote
- **Endpoint:** `/castvote`
- **Method:** `GET`
- **Parameters:**
  - `name` (String): Candidate name
- **Description:** Casts a vote for the specified candidate, incrementing their vote count.

### 3. Count Vote
- **Endpoint:** `/countvote`
- **Method:** `GET`
- **Parameters:**
  - `name` (String): Candidate name
- **Description:** Retrieves the current vote count for the specified candidate.

### 4. List Vote
- **Endpoint:** `/listvote`
- **Method:** `GET`
- **Description:** Returns a map of all candidates and their respective vote counts.

### 5. Get Winner
- **Endpoint:** `/getwinner`
- **Method:** `GET`
- **Description:** Determines and returns the candidate with the highest vote count.

## Usage
1. Clone the repository: `git clone https://github.com/Subhashgowdas/VotingApplication.git`
2. Run the Spring Boot application.
3. Use the provided endpoints to interact with the Voting Application.

## Additional Information
- This project uses Spring Boot.
- The main logic is implemented in the `UserController` class.

Feel free to explore and contribute to this simple voting system!

