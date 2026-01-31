package fr.spacefox.perftests.quarkus.data.entity905;

import fr.spacefox.perftests.quarkus.core.port.data.Entity905DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service905.model.Model905;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity905Repository implements Entity905DatasourcePort, PanacheRepository<Entity905> {
    @Override
    public Optional<Model905> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
