package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service443.model.Model443;
import java.util.Optional;

public interface Entity443DatasourcePort {
    Optional<Model443> find(Long id);
}
