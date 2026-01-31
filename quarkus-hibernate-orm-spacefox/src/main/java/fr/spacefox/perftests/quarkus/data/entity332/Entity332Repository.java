package fr.spacefox.perftests.quarkus.data.entity332;

import fr.spacefox.perftests.quarkus.core.port.data.Entity332DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service332.model.Model332;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity332Repository implements Entity332DatasourcePort, PanacheRepository<Entity332> {
    @Override
    public Optional<Model332> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
