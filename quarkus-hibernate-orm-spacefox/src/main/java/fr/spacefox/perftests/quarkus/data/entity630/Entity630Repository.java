package fr.spacefox.perftests.quarkus.data.entity630;

import fr.spacefox.perftests.quarkus.core.port.data.Entity630DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service630.model.Model630;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity630Repository implements Entity630DatasourcePort, PanacheRepository<Entity630> {
    @Override
    public Optional<Model630> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
