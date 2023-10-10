package com.msemail.notification.repositories;

import com.msemail.notification.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel, Long>{
}


