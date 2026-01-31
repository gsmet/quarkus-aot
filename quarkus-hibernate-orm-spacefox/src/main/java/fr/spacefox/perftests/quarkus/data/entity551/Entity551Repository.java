package fr.spacefox.perftests.quarkus.data.entity551;

import fr.spacefox.perftests.quarkus.core.port.data.Entity551DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service551.model.Model551;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity551Repository implements Entity551DatasourcePort, PanacheRepository<Entity551> {
    @Override
    public Optional<Model551> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
