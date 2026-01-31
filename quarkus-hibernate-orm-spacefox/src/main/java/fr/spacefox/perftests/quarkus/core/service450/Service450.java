package fr.spacefox.perftests.quarkus.core.service450;

import fr.spacefox.perftests.quarkus.core.port.data.Entity450DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service450.model.Model450;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service450 {

    private final Entity450DatasourcePort datasource;

    public Service450(Entity450DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model450 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
