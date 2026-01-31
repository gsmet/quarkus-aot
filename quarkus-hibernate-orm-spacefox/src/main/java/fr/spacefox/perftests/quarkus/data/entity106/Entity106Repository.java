package fr.spacefox.perftests.quarkus.data.entity106;

import fr.spacefox.perftests.quarkus.core.port.data.Entity106DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service106.model.Model106;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity106Repository implements Entity106DatasourcePort, PanacheRepository<Entity106> {
    @Override
    public Optional<Model106> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
