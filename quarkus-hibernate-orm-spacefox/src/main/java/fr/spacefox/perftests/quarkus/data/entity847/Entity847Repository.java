package fr.spacefox.perftests.quarkus.data.entity847;

import fr.spacefox.perftests.quarkus.core.port.data.Entity847DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service847.model.Model847;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity847Repository implements Entity847DatasourcePort, PanacheRepository<Entity847> {
    @Override
    public Optional<Model847> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
