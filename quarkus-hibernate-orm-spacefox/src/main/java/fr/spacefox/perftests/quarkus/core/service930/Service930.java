package fr.spacefox.perftests.quarkus.core.service930;

import fr.spacefox.perftests.quarkus.core.port.data.Entity930DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service930.model.Model930;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service930 {

    private final Entity930DatasourcePort datasource;

    public Service930(Entity930DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model930 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
