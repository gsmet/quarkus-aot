package fr.spacefox.perftests.quarkus.data.entity226;

import fr.spacefox.perftests.quarkus.core.port.data.Entity226DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service226.model.Model226;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity226Repository implements Entity226DatasourcePort, PanacheRepository<Entity226> {
    @Override
    public Optional<Model226> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
