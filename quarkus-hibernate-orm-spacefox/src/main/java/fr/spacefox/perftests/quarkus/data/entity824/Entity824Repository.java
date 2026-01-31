package fr.spacefox.perftests.quarkus.data.entity824;

import fr.spacefox.perftests.quarkus.core.port.data.Entity824DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service824.model.Model824;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity824Repository implements Entity824DatasourcePort, PanacheRepository<Entity824> {
    @Override
    public Optional<Model824> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
