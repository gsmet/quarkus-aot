package fr.spacefox.perftests.quarkus.data.entity464;

import fr.spacefox.perftests.quarkus.core.port.data.Entity464DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service464.model.Model464;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity464Repository implements Entity464DatasourcePort, PanacheRepository<Entity464> {
    @Override
    public Optional<Model464> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
