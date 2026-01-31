package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service725.model.Model725;
import java.util.Optional;

public interface Entity725DatasourcePort {
    Optional<Model725> find(Long id);
}
