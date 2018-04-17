package com.example.jessy.voterapp;

/**
 * Created by jessy on 17/4/18.
 */

public class Team {

        private int team_id;
        private String team_name;

        public Team() {}
        public Team(int id, String name){
            this.team_id=id;
            this.team_name=name;
        }
        public void setID(int id) {
            this.team_id = id;
        }

        public int getID() {
            return this.team_id;
        }

        public void setTeamName(String name) {
            this.team_name = name;
        }

        public String getStudentName() {
            return this.team_name
        }

}
