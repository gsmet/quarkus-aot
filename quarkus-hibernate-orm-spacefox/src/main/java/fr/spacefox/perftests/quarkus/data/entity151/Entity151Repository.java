package fr.spacefox.perftests.quarkus.data.entity151;

import fr.spacefox.perftests.quarkus.core.port.data.Entity151DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service151.model.Model151;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity151Repository implements Entity151DatasourcePort, PanacheRepository<Entity151> {
    @Override
    public Optional<Model151> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
