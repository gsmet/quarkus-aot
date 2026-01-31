package fr.spacefox.perftests.quarkus.data.entity956;

import fr.spacefox.perftests.quarkus.core.port.data.Entity956DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service956.model.Model956;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity956Repository implements Entity956DatasourcePort, PanacheRepository<Entity956> {
    @Override
    public Optional<Model956> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
