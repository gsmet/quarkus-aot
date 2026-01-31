package fr.spacefox.perftests.quarkus.data.entity324;

import fr.spacefox.perftests.quarkus.core.port.data.Entity324DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service324.model.Model324;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity324Repository implements Entity324DatasourcePort, PanacheRepository<Entity324> {
    @Override
    public Optional<Model324> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
