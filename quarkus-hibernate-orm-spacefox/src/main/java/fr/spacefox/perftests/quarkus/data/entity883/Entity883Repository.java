package fr.spacefox.perftests.quarkus.data.entity883;

import fr.spacefox.perftests.quarkus.core.port.data.Entity883DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service883.model.Model883;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity883Repository implements Entity883DatasourcePort, PanacheRepository<Entity883> {
    @Override
    public Optional<Model883> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
