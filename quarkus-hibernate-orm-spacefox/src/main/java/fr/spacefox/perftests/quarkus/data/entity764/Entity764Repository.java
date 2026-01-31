package fr.spacefox.perftests.quarkus.data.entity764;

import fr.spacefox.perftests.quarkus.core.port.data.Entity764DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service764.model.Model764;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity764Repository implements Entity764DatasourcePort, PanacheRepository<Entity764> {
    @Override
    public Optional<Model764> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
