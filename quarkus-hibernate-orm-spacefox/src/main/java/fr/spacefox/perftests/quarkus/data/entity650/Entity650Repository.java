package fr.spacefox.perftests.quarkus.data.entity650;

import fr.spacefox.perftests.quarkus.core.port.data.Entity650DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service650.model.Model650;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity650Repository implements Entity650DatasourcePort, PanacheRepository<Entity650> {
    @Override
    public Optional<Model650> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
