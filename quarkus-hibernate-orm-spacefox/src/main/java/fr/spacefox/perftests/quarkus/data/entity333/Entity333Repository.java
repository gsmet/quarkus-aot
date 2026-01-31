package fr.spacefox.perftests.quarkus.data.entity333;

import fr.spacefox.perftests.quarkus.core.port.data.Entity333DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service333.model.Model333;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity333Repository implements Entity333DatasourcePort, PanacheRepository<Entity333> {
    @Override
    public Optional<Model333> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
