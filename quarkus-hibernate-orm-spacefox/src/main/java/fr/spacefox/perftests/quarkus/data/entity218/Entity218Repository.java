package fr.spacefox.perftests.quarkus.data.entity218;

import fr.spacefox.perftests.quarkus.core.port.data.Entity218DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service218.model.Model218;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity218Repository implements Entity218DatasourcePort, PanacheRepository<Entity218> {
    @Override
    public Optional<Model218> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
