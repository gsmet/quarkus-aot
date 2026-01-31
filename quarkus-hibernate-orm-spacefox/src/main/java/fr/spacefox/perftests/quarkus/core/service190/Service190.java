package fr.spacefox.perftests.quarkus.core.service190;

import fr.spacefox.perftests.quarkus.core.port.data.Entity190DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service190.model.Model190;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service190 {

    private final Entity190DatasourcePort datasource;

    public Service190(Entity190DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model190 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
