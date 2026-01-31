package fr.spacefox.perftests.quarkus.data.entity190;

import fr.spacefox.perftests.quarkus.core.port.data.Entity190DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service190.model.Model190;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity190Repository implements Entity190DatasourcePort, PanacheRepository<Entity190> {
    @Override
    public Optional<Model190> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
