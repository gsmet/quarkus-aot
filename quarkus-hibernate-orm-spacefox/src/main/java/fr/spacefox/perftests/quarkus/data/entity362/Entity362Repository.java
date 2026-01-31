package fr.spacefox.perftests.quarkus.data.entity362;

import fr.spacefox.perftests.quarkus.core.port.data.Entity362DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service362.model.Model362;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity362Repository implements Entity362DatasourcePort, PanacheRepository<Entity362> {
    @Override
    public Optional<Model362> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
