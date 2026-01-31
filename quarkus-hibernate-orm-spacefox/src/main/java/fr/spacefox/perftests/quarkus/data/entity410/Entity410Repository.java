package fr.spacefox.perftests.quarkus.data.entity410;

import fr.spacefox.perftests.quarkus.core.port.data.Entity410DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service410.model.Model410;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity410Repository implements Entity410DatasourcePort, PanacheRepository<Entity410> {
    @Override
    public Optional<Model410> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
