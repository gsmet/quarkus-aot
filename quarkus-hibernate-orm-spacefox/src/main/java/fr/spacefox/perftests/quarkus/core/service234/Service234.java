package fr.spacefox.perftests.quarkus.core.service234;

import fr.spacefox.perftests.quarkus.core.port.data.Entity234DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service234.model.Model234;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service234 {

    private final Entity234DatasourcePort datasource;

    public Service234(Entity234DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model234 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
