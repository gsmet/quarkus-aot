package fr.spacefox.perftests.quarkus.data.entity141;

import fr.spacefox.perftests.quarkus.core.port.data.Entity141DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service141.model.Model141;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity141Repository implements Entity141DatasourcePort, PanacheRepository<Entity141> {
    @Override
    public Optional<Model141> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
