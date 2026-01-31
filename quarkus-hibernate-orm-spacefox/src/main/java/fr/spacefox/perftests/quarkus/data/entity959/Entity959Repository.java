package fr.spacefox.perftests.quarkus.data.entity959;

import fr.spacefox.perftests.quarkus.core.port.data.Entity959DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service959.model.Model959;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity959Repository implements Entity959DatasourcePort, PanacheRepository<Entity959> {
    @Override
    public Optional<Model959> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
