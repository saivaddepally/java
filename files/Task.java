package com.saikumar;


    class Task {
        public String name;
        private String description;
        public Task()
        {

        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public Status getStatus() {
            return status;
        }

        public void setStatus(Status status) {
            this.status = status;
        }

        public int getTaskId() {
            return taskId;
        }

        public void setTaskId(int taskId) {
            this.taskId = taskId;
        }

        private String date;
        private Status status;
        private int taskId;

        public Task(String name, String description, String date, Status status, int taskId) {
            this.name = name;
            this.description = description;
            this.date = date;
            this.status = status;
            this.taskId = taskId;
        }

        @Override
        public String toString() {
            return "Task{" +
                    "name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    ", date='" + date + '\'' +
                    ", status=" + status +
                    ", taskId=" + taskId +
                    '}';
        }
    }

