package fr.spacefox.perftests.quarkus.data.entity113;

import fr.spacefox.perftests.quarkus.core.port.data.Entity113DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service113.model.Model113;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity113Repository implements Entity113DatasourcePort, PanacheRepository<Entity113> {
    @Override
    public Optional<Model113> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
