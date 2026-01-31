package fr.spacefox.perftests.quarkus.data.entity114;

import fr.spacefox.perftests.quarkus.core.port.data.Entity114DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service114.model.Model114;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity114Repository implements Entity114DatasourcePort, PanacheRepository<Entity114> {
    @Override
    public Optional<Model114> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
