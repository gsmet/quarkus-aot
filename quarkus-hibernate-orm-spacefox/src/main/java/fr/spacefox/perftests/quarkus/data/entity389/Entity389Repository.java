package fr.spacefox.perftests.quarkus.data.entity389;

import fr.spacefox.perftests.quarkus.core.port.data.Entity389DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service389.model.Model389;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity389Repository implements Entity389DatasourcePort, PanacheRepository<Entity389> {
    @Override
    public Optional<Model389> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
