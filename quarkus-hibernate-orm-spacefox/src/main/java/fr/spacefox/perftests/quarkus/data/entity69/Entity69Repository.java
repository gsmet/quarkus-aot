package fr.spacefox.perftests.quarkus.data.entity69;

import fr.spacefox.perftests.quarkus.core.port.data.Entity69DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service69.model.Model69;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity69Repository implements Entity69DatasourcePort, PanacheRepository<Entity69> {
    @Override
    public Optional<Model69> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
