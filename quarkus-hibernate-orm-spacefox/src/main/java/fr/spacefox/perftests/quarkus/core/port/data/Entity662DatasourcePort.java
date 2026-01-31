package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service662.model.Model662;
import java.util.Optional;

public interface Entity662DatasourcePort {
    Optional<Model662> find(Long id);
}
