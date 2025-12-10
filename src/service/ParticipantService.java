package com.example.college.service;

import com.example.college.dao.ParticipantDAO;
import com.example.college.model.Participant;

public class ParticipantService {
    private ParticipantDAO participantDAO = new ParticipantDAO();

    public void registerParticipant(int id, String name, String department) {
        participantDAO.addParticipant(new Participant(id, name, department));
    }

    public Participant findParticipant(int id) {
        return participantDAO.findParticipantById(id);
    }

    public void listParticipants() {
        for (Participant p : participantDAO.getAllParticipants()) {
            System.out.println(p.getId() + ": " + p.getName() + " (" + p.getDepartment() + ")");
        }
    }
}
