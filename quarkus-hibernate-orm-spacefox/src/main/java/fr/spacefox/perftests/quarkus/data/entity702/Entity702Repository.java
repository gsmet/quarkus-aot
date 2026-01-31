package fr.spacefox.perftests.quarkus.data.entity702;

import fr.spacefox.perftests.quarkus.core.port.data.Entity702DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service702.model.Model702;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity702Repository implements Entity702DatasourcePort, PanacheRepository<Entity702> {
    @Override
    public Optional<Model702> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
