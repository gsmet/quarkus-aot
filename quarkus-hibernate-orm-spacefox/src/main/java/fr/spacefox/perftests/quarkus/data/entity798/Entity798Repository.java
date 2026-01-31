package fr.spacefox.perftests.quarkus.data.entity798;

import fr.spacefox.perftests.quarkus.core.port.data.Entity798DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service798.model.Model798;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity798Repository implements Entity798DatasourcePort, PanacheRepository<Entity798> {
    @Override
    public Optional<Model798> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
