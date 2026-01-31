package fr.spacefox.perftests.quarkus.data.entity339;

import fr.spacefox.perftests.quarkus.core.port.data.Entity339DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service339.model.Model339;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity339Repository implements Entity339DatasourcePort, PanacheRepository<Entity339> {
    @Override
    public Optional<Model339> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
