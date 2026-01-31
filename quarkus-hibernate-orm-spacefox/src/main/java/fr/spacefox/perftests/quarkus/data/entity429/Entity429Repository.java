package fr.spacefox.perftests.quarkus.data.entity429;

import fr.spacefox.perftests.quarkus.core.port.data.Entity429DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service429.model.Model429;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity429Repository implements Entity429DatasourcePort, PanacheRepository<Entity429> {
    @Override
    public Optional<Model429> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
