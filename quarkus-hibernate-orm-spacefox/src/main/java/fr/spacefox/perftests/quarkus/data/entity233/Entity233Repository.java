package fr.spacefox.perftests.quarkus.data.entity233;

import fr.spacefox.perftests.quarkus.core.port.data.Entity233DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service233.model.Model233;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity233Repository implements Entity233DatasourcePort, PanacheRepository<Entity233> {
    @Override
    public Optional<Model233> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
