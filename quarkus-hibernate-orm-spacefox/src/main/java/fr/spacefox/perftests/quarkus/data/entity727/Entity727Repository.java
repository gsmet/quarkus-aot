package fr.spacefox.perftests.quarkus.data.entity727;

import fr.spacefox.perftests.quarkus.core.port.data.Entity727DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service727.model.Model727;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity727Repository implements Entity727DatasourcePort, PanacheRepository<Entity727> {
    @Override
    public Optional<Model727> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
