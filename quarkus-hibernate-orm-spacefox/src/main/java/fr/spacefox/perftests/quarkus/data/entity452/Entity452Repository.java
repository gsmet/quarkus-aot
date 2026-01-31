package fr.spacefox.perftests.quarkus.data.entity452;

import fr.spacefox.perftests.quarkus.core.port.data.Entity452DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service452.model.Model452;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity452Repository implements Entity452DatasourcePort, PanacheRepository<Entity452> {
    @Override
    public Optional<Model452> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
