package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service149.model.Model149;
import java.util.Optional;

public interface Entity149DatasourcePort {
    Optional<Model149> find(Long id);
}
