package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service914.model.Model914;
import java.util.Optional;

public interface Entity914DatasourcePort {
    Optional<Model914> find(Long id);
}
