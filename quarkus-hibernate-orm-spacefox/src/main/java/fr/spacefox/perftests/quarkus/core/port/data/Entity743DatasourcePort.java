package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service743.model.Model743;
import java.util.Optional;

public interface Entity743DatasourcePort {
    Optional<Model743> find(Long id);
}
