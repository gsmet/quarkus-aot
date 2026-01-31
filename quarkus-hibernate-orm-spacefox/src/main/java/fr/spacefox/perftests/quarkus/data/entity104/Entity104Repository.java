package fr.spacefox.perftests.quarkus.data.entity104;

import fr.spacefox.perftests.quarkus.core.port.data.Entity104DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service104.model.Model104;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity104Repository implements Entity104DatasourcePort, PanacheRepository<Entity104> {
    @Override
    public Optional<Model104> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
