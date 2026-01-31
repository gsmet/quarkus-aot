package fr.spacefox.perftests.quarkus.data.entity157;

import fr.spacefox.perftests.quarkus.core.port.data.Entity157DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service157.model.Model157;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity157Repository implements Entity157DatasourcePort, PanacheRepository<Entity157> {
    @Override
    public Optional<Model157> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
