package fr.spacefox.perftests.quarkus.data.entity300;

import fr.spacefox.perftests.quarkus.core.port.data.Entity300DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service300.model.Model300;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity300Repository implements Entity300DatasourcePort, PanacheRepository<Entity300> {
    @Override
    public Optional<Model300> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
